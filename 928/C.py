for _ in range(int(input())):

    n = int(input())

    suma = 0
    # offset = 1
    i = 1
    while True:
        offset = sum([int(x) for x in str(i + 9)])

        suma += (9 * offset) + 36 + offset
        # print(suma)
        # offset += 1

        i += 10
        if abs(n - i) < 10 and i != n:
            break

    # if abs(n - i) < 10 and i != n:
    #     offset = sum([int(x) for x in str(i + 9)])

    # while i <= n:
    #     suma += offset
    #     offset += 1
    #     i += 1

    print(suma)