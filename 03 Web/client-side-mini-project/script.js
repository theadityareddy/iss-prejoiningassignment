// Form validation function called on submit
function validateForm() {

    // Get form input values from DOM
    const name = document.getElementById("name").value;
    const cubeType = document.getElementById("cubeType").value;
    const time = document.getElementById("time").value;
    const result = document.getElementById("result");

    // Check if name is empty
    if (name.trim() === "") {
        alert("Name cannot be empty");
        return false;
    }

    // Check if cube type is selected
    if (cubeType === "") {
        alert("Please select a cube type");
        return false;
    }

    // Check if solve time is valid (positive number)
    if (time <= 0) {
        alert("Solve time must be positive");
        return false;
    }

    // Display success message using template literal
    result.innerText = `Practice session submitted successfully! Keep cubing 🧊`;

    // Prevent default form submission
    return false;
}
