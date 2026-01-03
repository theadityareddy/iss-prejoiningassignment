# PYTHON : CONTROL FLOW STATEMENTS


# If-else statement
best_time = 11.5

if best_time < 12:
    print("Excellent solve!")
else:
    print("Keep practicing")

# For loop
for attempt in range(1, 6):
    print(f"Attempt {attempt}")

# While loop
count = 3
while count > 0:
    print("Solving...")
    count -= 1

# Break statement
for time in [15, 14, 20, 12]:
    if time > 18:
        break
    print("Valid time:", time)

# Continue statement
for time in [10, -1, 12]:
    if time < 0:
        continue
    print("Recorded:", time)

# Pass statement
for i in range(3):
    pass

# Loop with else
for time in [12, 11, 10]:
    if time > 20:
        break
else:
    print("All solves were valid")
