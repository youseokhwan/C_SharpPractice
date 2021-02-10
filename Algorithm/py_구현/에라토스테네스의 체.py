n = int(input('n 입력: '))
isPrime = [False, False] + [True]*(n-1)
ans = []

for i in range(2, n+1):
    if isPrime[i] == True:
        ans.append(i)
        for j in range(i+i, n+1, i):
            isPrime[j] = False

print('n 이하 소수: ', ans)
