let currentDisplay = '0';
const display = document.getElementById('display');

function updateDisplay() {
    display.textContent = currentDisplay;
}

function appendToDisplay(value) {
    if (currentDisplay === '0' && value !== '.') {
        currentDisplay = value;
    } else {
        currentDisplay += value;
    }
    updateDisplay();
}

function clearDisplay() {
    currentDisplay = '0';
    updateDisplay();
}

function backspace() {
    if (currentDisplay.length === 1) {
        currentDisplay = '0';
    } else {
        currentDisplay = currentDisplay.slice(0, -1);
    }
    updateDisplay();
}

function calculateResult() {
    try {
        // Replace × and ÷ with * and / for evaluation
        const expression = currentDisplay.replace(/×/g, '*').replace(/÷/g, '/');
        currentDisplay = eval(expression).toString();
        updateDisplay();
    } catch (error) {
        currentDisplay = 'Error';
        updateDisplay();
        setTimeout(clearDisplay, 1000);
    }
}

// Initialize display
updateDisplay();