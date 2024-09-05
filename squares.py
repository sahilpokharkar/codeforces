t = int(input())

for _ in range(t):
    
    x1, y1 = map(int, input().split())
    x2, y2 = map(int, input().split())
    x3, y3 = map(int, input().split())
    x4, y4 = map(int, input().split())
    
    area = 0
    
    if x1 == x2:
        area += (x1 - x2)**2 + (y1 - y2)**2
    elif x1 == x3:
        area += (x1 - x3)**2 + (y1 - y3)**2
    else:
        area += (x1 - x4)**2 + (y1 - y4)**2
        
    print(area)