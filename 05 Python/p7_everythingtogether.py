# PYTHON MINI DEMO: ALL CONCEPTS TOGETHER


# Variables and data types
solver = "Aditya"
times = [12.5, 11.9, 11.7]

# Function usage
def best_time(times):
    return min(times)

# Control flow
best = best_time(times)

if best < 12:
    result = "Great performance"
else:
    result = "Needs improvement"

# Exception handling
try:
    print(f"{solver}'s best time is {best}")
except Exception as e:
    print("Error:", e)
finally:
    print(result)
