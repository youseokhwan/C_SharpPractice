/*
 * 컬렉션(List, Map, Set)
 */

// List
var items = ['짜장', '라면', '볶음밥'];

items[0] = '떡볶이';

print(items.length);
print(items[2]);
print(items[3]);

for (var i = 0; i < items.length; i++) {
  print(items[i]);
}


// Map
var cityMap = {
  '한국': '부산',
  '일본': '도쿄',
  '중국': '북경'
};

cityMap['한국'] = '서울';

print(cityMap.length);
print(cityMap['중국']);
print(cityMap['미국']); // null

cityMap['미국'] = '워싱턴';
print(cityMap['미국']);


// Set
var citySet = {'서울', '수원', '오산', '부산'};

citySet.add('안양');
citySet.remove('수원');

print(citySet.contains('서울')); // true
print(citySet.contains('ehzy')); // false
