def maxSubArray(arr):
    max = 0
    for i in range(len(arr)):
        for j in range(i, len(arr)):
            sum = 0
            for k in range(i, j + 1):
                sum += arr[k]
            if sum > max:
                max = sum
    return max


def maxSubFaster(arr):
    sum = 0
    for i in range(len(arr)):
        sum = sum + arr[i]
    max = 0
    for j in range(len(arr)):
        for k in range(j, len(arr)):
            sum = sum - arr[k]
            if sum > max:
                max = sum
    return max


def maxSubFastest(arr):
    max_current = max_global = arr[0]
    for i in range(1, len(arr)):
        max_current = max(arr[i], max_current + arr[i])
        if max_current > max_global:
            max_global = max_current
    return max_global


def main():
    arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    print(maxSubFaster(arr))