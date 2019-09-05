def GCD(A, B):
    if B == 0:
        return A
    else:
        return GCD(B, A%B)

A, B = map(int, input().split())
print('최대공약수: ', GCD(A, B))
print('최소공배수: ', int(A*B/GCD(A, B)))
