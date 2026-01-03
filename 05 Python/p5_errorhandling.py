# PYTHON : ERROR HANDLING


# Try-except block
try:
    time = int("abc")
except ValueError:
    print("Invalid time input")

# Try-except-else-finally
try:
    solve_time = int("15")
except ValueError:
    print("Conversion failed")
else:
    print("Converted successfully:", solve_time)
finally:
    print("Attempt completed")

# Raising custom exception
def record_time(time):
    if time <= 0:
        raise ValueError("Solve time must be positive")
    print("Time recorded:", time)

record_time(12)
