const crypto = require('crypto');

console.log('base64: ', crypto.createHash('sha512').update('abc123').digest('base64'));
console.log('base64: ', crypto.createHash('sha512').update('abc123').digest('base64'));
console.log('base64: ', crypto.createHash('sha512').update('abc124').digest('base64'));

crypto.randomBytes(64, (err, buf) => {
    const salt = buf.toString('base64');
    console.log('salt: ', salt);
    crypto.pbkdf2('abc123', salt, 100000, 64, 'sha512', (err, key) => {
        console.log('password: ', key.toString('base64'));
    });
});