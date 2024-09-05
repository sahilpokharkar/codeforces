for _ in range(int(input())):

    n = int(input())
    arr = [x for x in input()]

    count = 0

    for i in range(n):
        
        if arr[i] == '@':   count += 1
        
        if i + 1 < n:
            if arr[i] == '*' and arr[i + 1] == '*': break

    print(count)

    