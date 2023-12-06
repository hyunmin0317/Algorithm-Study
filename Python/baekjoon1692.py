def power(base, exponent, modulus):
    if exponent == 0:
        return 1 % modulus
    elif exponent % 2 == 0:
        half_power = power(base, exponent // 2, modulus)
        return (half_power * half_power) % modulus
    else:
        return (base * power(base, exponent - 1, modulus)) % modulus

a, b, c = map(int, input().split())
result = power(a, b, c)
print(result)
