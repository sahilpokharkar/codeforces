for s in[*open(0)][1:]:
    print(('YES '+s[1:-1]+s[0],'NO')[len({*s}) <= 2])