# PYTHON : DATA STRUCTURES


# List operations
times = [15, 14, 13]
times.sort()
times.remove(14)

# Tuple unpacking
city, country = ("Mumbai", "India")

# Set operations
set_a = {1, 2, 3}
set_b = {3, 4, 5}
common = set_a.intersection(set_b)

# Dictionary operations
cube = {"type": "3x3", "weight": 85}
cube["brand"] = "Gan"
cube.pop("weight")

print(times, city, common, cube)
