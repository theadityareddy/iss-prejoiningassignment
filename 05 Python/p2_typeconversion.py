# PYTHON : TYPE CONVERSION


# Implicit type conversion
solve_count = 10
average = 12.5
total = solve_count + average
print("Total:", total)

# Explicit type conversion
time_str = "15"
time_int = int(time_str)
print("Converted time:", time_int)

# Integer to float
attempts = 3
attempts_float = float(attempts)

# Float to integer (data loss)
average_time = 12.9
rounded_time = int(average_time)

# String to boolean
value = ""
boolean_value = bool(value)

print(attempts_float, rounded_time, boolean_value)
