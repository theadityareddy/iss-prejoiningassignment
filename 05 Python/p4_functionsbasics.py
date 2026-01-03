# PYTHON : FUNCTIONS


# Function with parameters and return value
def calculate_average(times):
    return sum(times) / len(times)

solve_times = [12.4, 11.8, 11.5]
average = calculate_average(solve_times)
print("Average time:", average)

# Function with default parameter
def greet_solver(name="Cubing Enthusiast"):
    print(f"Hello, {name}")

greet_solver("Aditya")
greet_solver()

# Function with *args
def log_solves(*times):
    for t in times:
        print("Solve:", t)

log_solves(12.1, 11.9, 11.6)

# Function with **kwargs
def cube_info(**details):
    for key, value in details.items():
        print(key, ":", value)

cube_info(type="3x3", magnetic=True, brand="Gan")
