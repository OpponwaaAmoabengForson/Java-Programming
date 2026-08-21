# 🧑‍🎓 1. Student Registration System

The Student Registration System was my first bigger Java program where I combined the concepts I had learned.

## 🎯 What the Program Does

The program:

- Displays a welcome message
- Asks how many students will be registered
- Uses a for loop to process each student
- Asks for the student's name
- Asks for the student's age
- Categorizes the student
- Counts students in different categories
- Calculates the Total Age of the students
- Calculates the average of the Total Age
- Displays the student's information
- Displays a final message
- Closes the Scanner

---

### 🧠 Concepts Used

The project uses:

- Variables
- Data types
- Scanner
- User input
- nextInt()
- nextLine()
- if
- else if
- else
- Comparison operators
- Logical operators
- for loops
- Methods
- Method parameters
- Counters
- Multiple counters
- Accumulators
- Scanner.close()

---

### 👥 Student Categories

The program uses the student's age to decide the category.

if (age < 13) {
    children++;
} else if (age >= 13 && age <= 17) {
    teens++;
} else {
    adults++;
}

The counters keep track of how many students fall into each category.

For example:

Adults   → 3
Teens    → 2
Children → 4

---

### 💡 What Building This Project Taught Me

Building this project helped me understand that programming is not just about knowing individual pieces.

I had to connect:

Variables
   ↓
Scanner
   ↓
User Input
   ↓
Conditions
   ↓
Loops
   ↓
Methods
   ↓
Counters
   ↓
Accumulators
   ↓
Output

The project also gave me real debugging experience.

I made mistakes with things like:

- Scanner names
- nextInt() and nextLine()- Putting code inside or outside loops
- Loop conditions
- Counter placement

Instead of just reading about these concepts, I had to figure out why my program was behaving differently from what I expected.

That made the concepts easier to understand.
