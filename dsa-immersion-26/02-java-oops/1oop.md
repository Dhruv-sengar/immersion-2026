# Difference Between HAS-A and IS-A in Java

## IS-A Relationship (Inheritance)

An IS-A relationship means one class is a type of another class.

### Example

```java
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
}
```

### Explanation

- Dog is an Animal.
- Dog inherits properties and methods from Animal.
- This is called **Inheritance**.

**Sentence:**  
👉 Dog **IS-A** Animal.

---

## HAS-A Relationship (Composition)

A HAS-A relationship means one class contains an object of another class.

### Example

```java
class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();
}
```

### Explanation

- Car contains an Engine object.
- Car uses Engine's functionality.
- This is called **Composition**.

**Sentence:**  
👉 Car **HAS-A** Engine.

---

## Key Differences

| IS-A | HAS-A |
|--------|--------|
| Represents Inheritance | Represents Composition/Aggregation |
| Uses `extends` keyword | Uses object reference |
| Creates parent-child relationship | Creates container-part relationship |
| Example: Dog IS-A Animal | Example: Car HAS-A Engine |

---

## Easy Interview Answer

**IS-A:** One class is a type of another class (Inheritance).

**HAS-A:** One class contains an object of another class (Composition).

### Simple Examples

- Dog IS-A Animal ✅
- Car HAS-A Engine ✅
- Student HAS-A Laptop ✅
- Cat IS-A Animal ✅