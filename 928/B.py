def isSquare(grid):

    count = 0
    for i in range(n):
        prevcount = count
        count = 0
        
        count = grid[i].count(1)

        if prevcount != 0 and prevcount != count:
            if count == 0:
                prevcount = 0
            break

    return prevcount == count


for _ in range(int(input())):
    
    n = int(input())
    
    grid = []
    
    for i in range(n):
        grid.append([int(x) for x in input()])

        
    if isSquare(grid):  print("SQUARE")
    else:   print("TRIANGLE")
