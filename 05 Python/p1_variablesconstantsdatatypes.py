# PYTHON : VARIABLES, CONSTANTS, DATA TYPES


# Variable declaration and assignment
cube_size = 3
solver_name = "Aditya"
average_time = 12.45
is_practicing = True

# Constants (by convention, written in uppercase)
MAX_ATTEMPTS = 5
PI_VALUE = 3.14159

# Integer data type
solve_count = 120
penalty = -2

# String data type
cube_type = "3x3 Speed Cube"

# f-strings (formatted strings)
message = f"{solver_name} is practicing with a {cube_type}"
print(message)

# Boolean data type
is_solved = False
print("Solved:", is_solved)

# List data type (ordered, mutable)
solve_times = [14.2, 13.9, 12.8, 11.7]
solve_times.append(10.9)
print("Solve times:", solve_times)

# Tuple data type (ordered, immutable)
competition_location = ("Mumbai", "India")

# Set data type (unordered, unique elements)
cube_brands = {"Gan", "MoYu", "QiYi", "Gan"}
print("Cube brands:", cube_brands)

# Dictionary data type (key-value pairs)
cube_details = {
    "type": "3x3",
    "magnetic": True,
    "weight": 85
}
print("Cube details:", cube_details)
