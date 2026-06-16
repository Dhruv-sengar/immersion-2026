# DBMS Placement & Interview Notes (Quick Revision)

## 1. Entity

**Entity:** A real-world object that can be uniquely identified.

### Examples
- Student
- Employee
- Product
- Customer

### Types of Entity

#### Strong Entity
- Has its own primary key.
- Exists independently.

Example:
```
Student(StudentID, Name, Age)
```

#### Weak Entity
- Does not have a primary key of its own.
- Depends on a strong entity.

Example:
```
Dependent(DependentName, EmployeeID)
```

---

# 2. Keys in DBMS

## Super Key
A set of one or more attributes that uniquely identifies a tuple (row).

Example:

| RollNo | Name | Email |
|---------|--------|---------|
| 101 | John | john@gmail.com |

Possible Super Keys:
- {RollNo}
- {Email}
- {RollNo, Name}
- {RollNo, Email}

---

## Candidate Key
A minimal super key.

Example:
- RollNo
- Email

### Important Interview Point
✅ All Candidate Keys are Super Keys.

❌ All Super Keys are NOT Candidate Keys.

---

## Primary Key
One candidate key selected to uniquely identify records.

Example:
```
Student(RollNo, Name, Age)
```

Primary Key = RollNo

### Properties
- Unique
- Not NULL
- Stable

---

## Alternate Key
Candidate keys not chosen as primary key.

Example:
```
Candidate Keys = {RollNo, Email}
Primary Key = RollNo
Alternate Key = Email
```

---

## Composite Key
Primary key formed using multiple attributes.

Example:
```
Enrollment(StudentID, CourseID)
```

Primary Key:
```
(StudentID, CourseID)
```

---

## Foreign Key
Attribute that references the primary key of another table.

Example:

```
Department(DeptID, DeptName)

Employee(EmpID, Name, DeptID)
```

DeptID in Employee is a Foreign Key.

---

# Interview Question

## Can Foreign Key be NULL?

### Yes
When participation is optional.

Example:
```
Employee(EmpID, Name, ManagerID)
```

Top manager has:
```
ManagerID = NULL
```

---

## Can Foreign Key have Duplicate Values?

### Yes

Many employees can belong to the same department.

```
EmpID | DeptID
1     | 10
2     | 10
3     | 10
```

Duplicates are allowed.

---

# 3. Prime and Non-Prime Attributes

## Prime Attribute
Attribute that is part of a Candidate Key.

Example:
```
Student(RollNo, Email, Name)
```

Candidate Keys:
- RollNo
- Email

Prime Attributes:
- RollNo
- Email

---

## Non-Prime Attribute

Attributes not part of any Candidate Key.

Example:
- Name

---

# 4. Composite Key vs Compound Key

## Composite Key
Key formed by combining multiple attributes.

Example:
```
(StudentID, CourseID)
```

---

## Compound Key
A special type of composite key where all attributes are foreign keys.

Example:
```
Enrollment(StudentID, CourseID)
```

Both are foreign keys.

---

# 5. Relationships in DBMS

## 1 : 1 (One-to-One)

One entity related to only one entity.

Example:
```
Person ↔ Passport
```

One person → One passport

---

## 1 : M (One-to-Many)

One entity related to many entities.

Example:
```
Department → Employees
```

One department → Many employees

---

## M : 1 (Many-to-One)

Many entities related to one entity.

Example:
```
Employees → Department
```

Many employees → One department

---

## M : M (Many-to-Many)

Many entities related to many entities.

Example:
```
Students ↔ Courses
```

One student → Many courses

One course → Many students

Implemented using a junction table.

---

# 6. Cardinality Constraints

Defines the number of entities participating in a relationship.

### Types

| Cardinality | Meaning |
|------------|---------|
| 1:1 | One to One |
| 1:M | One to Many |
| M:1 | Many to One |
| M:M | Many to Many |

### Example

```
Student ------ Enrolls ------ Course
```

A student can enroll in many courses.

A course can have many students.

Cardinality = M:M

---

# 7. Participation Constraints

## Total Participation
Every entity must participate.

Represented by:
```
Double Line
```

Example:
Every employee must belong to a department.

---

## Partial Participation
Participation is optional.

Represented by:
```
Single Line
```

Example:
Employee may manage a project.

---

# 8. ER Model

## ER = Entity Relationship Model

Used to design database structure.

### Components

#### Entity
Rectangle

```
+---------+
| Student |
+---------+
```

#### Attribute
Oval

```
(StudentName)
```

#### Relationship
Diamond

```
Student ◇ Enrolls ◇ Course
```

---

# 9. Domain

Domain = Set of valid values an attribute can take.

Example:

```
Age → 0 to 120
Gender → {Male, Female, Other}
```

### Interview Definition

"A domain is the permissible set of values for an attribute."

---

# Frequently Asked Interview Questions

### Q1. Difference between Primary Key and Candidate Key?

| Primary Key | Candidate Key |
|-------------|--------------|
| Selected candidate key | Minimal unique key |
| Only one | Multiple possible |

---

### Q2. Can Primary Key be NULL?

❌ No

---

### Q3. Can Candidate Key be NULL?

❌ No

---

### Q4. Can Foreign Key be NULL?

✅ Yes

---

### Q5. Can Foreign Key contain duplicates?

✅ Yes

---

### Q6. Difference between Super Key and Candidate Key?

| Super Key | Candidate Key |
|------------|---------------|
| May contain extra attributes | Minimal |
| Not necessarily minimal | Always minimal |

---

### Q7. What is a Weak Entity?

Entity that cannot be uniquely identified without another entity.

---

### Q8. Why is a Primary Key required?

- Uniquely identifies records.
- Prevents duplicates.
- Helps maintain integrity.

---

# 30-Second Placement Revision

- Entity = Real-world object.
- Strong Entity → Own PK.
- Weak Entity → Depends on strong entity.
- Super Key → Unique identifier.
- Candidate Key → Minimal Super Key.
- Primary Key → Selected Candidate Key.
- Alternate Key → Remaining Candidate Keys.
- Composite Key → Multiple attributes as PK.
- Foreign Key → References another table PK.
- FK can be NULL and Duplicate.
- Prime Attribute → Part of Candidate Key.
- Non-Prime Attribute → Not part of Candidate Key.
- Relationships → 1:1, 1:M, M:1, M:M.
- Cardinality → Number of participating entities.
- ER Model → Entity + Relationship + Attributes.
- Domain → Allowed values of an attribute.