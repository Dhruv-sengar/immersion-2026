# 42. What happens internally when an object is created?

When we write:

```java
Student s = new Student();
```

- Memory is allocated in Heap Memory.
- Constructor is called.
- Object is initialized.
- Reference variable `s` stores the object's address.

---

# 43. Explain `Student s = new Student();`

- `Student` → Class name
- `s` → Reference variable
- `new Student()` → Creates an object
- `=` → Assigns object reference to `s`

---

# 44. Difference between Reference Variable and Object

### Reference Variable
- Stores the address of an object.
- Example: `s`

### Object
- Stores actual data and methods.
- Example: `new Student()`

---

# 45. Where are objects stored in memory?

Objects are stored in:

```text
Heap Memory
```

---

# 46. Difference between Stack Memory and Heap Memory

| Stack Memory | Heap Memory |
|-------------|-------------|
| Stores local variables and references | Stores objects |
| Faster | Slower |
| Automatically managed | Managed by Garbage Collector |

---

# 47. What stores local variables?

```text
Stack Memory
```

Example:

```java
int x = 10;
```

---

# 48. What stores objects?

```text
Heap Memory
```

Example:

```java
Student s = new Student();
```

---

# 49. Why is Stack Memory faster than Heap Memory?

- Stack follows LIFO (Last In First Out).
- Memory allocation and deallocation are simple.
- No Garbage Collection is required.

Therefore, Stack Memory is faster than Heap Memory.

---

# 50. What is Garbage Collection?

Garbage Collection is the process of automatically removing unused objects from Heap Memory.

Example:

```java
Student s = new Student();
s = null;
```

The object becomes unreachable and can be removed by the Garbage Collector.

### Interview Answer

> Garbage Collection automatically removes unused objects from Heap Memory and frees memory.

# How to Print Without Using Semicolon (;) in Java

### Method 1: Using `if` Statement

```java
public class Main {
    public static void main(String[] args) {
        if (System.out.printf("Hello World") == null) {
        }
    }
}
```

### Output

```text
Hello World
```

### Explanation

- `printf()` prints the text.
- It is placed inside the `if` condition.
- No semicolon is used after the print statement.

---

### Method 2: Using `while`

```java
public class Main {
    public static void main(String[] args) {
        while (System.out.printf("Hello") == null) {
        }
    }
}
```

---

### Interview Answer

> We can print without using a semicolon by placing `System.out.printf()` inside the condition of an `if` or `while` statement because the condition itself does not require a semicolon.

# What is System.out.print()?

`System.out.print()` is a Java method used to display output on the console without moving the cursor to the next line.

### Components

- **System** → Predefined Java class.
- **out** → Standard output stream (console).
- **print()** → Method used to print data.

### Example

```java
System.out.print("Hello");
```

### Output

```text
Hello
```

### Difference from println()

- `print()` → Prints on the same line.
- `println()` → Prints and moves to the next line.

### Interview Answer

> `System.out.print()` is a method used to display output on the console without moving the cursor to the next line.