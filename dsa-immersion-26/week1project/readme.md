# Online Food Delivery System

A simple Java program demonstrating **Object-Oriented Programming (OOP)** concepts through an automated food ordering and billing system.

## Classes

### `FoodItem`
| Member | Type | Description |
|--------|------|-------------|
| `itemId` | `int` | Unique item ID |
| `itemName` | `String` | Name of the food item |
| `price` | `int` | Price per unit |
| `quantity` | `int` | Ordered quantity |

**Methods:**
- `FoodItem(...)` — Constructor
- `calculateAmount()` — Returns `price × quantity`
- `displayItemDetails()` — Prints item info

### `Customer`
| Member | Type | Description |
|--------|------|-------------|
| `customerId` | `int` | Unique customer ID |
| `customerName` | `String` | Full name |
| `mobileNumber` | `String` | Contact number |

**Methods:**
- `Customer(...)` — Constructor
- `displayCustomerDetails()` — Prints customer info

## How to Run

```bash
javac FoodDelivery.java
java FoodDelivery
```

## Sample Output

```
Customer Name : Rahul Sharma

Item Name : Burger
Price     : 120
Quantity  : 2
Amount    : 240

Item Name : Pizza
Price     : 300
Quantity  : 1
Amount    : 300

------------------------
Total Bill: 840
------------------------
```

## OOP Concepts Used

- **Classes & Objects** — `FoodItem` and `Customer` classes with multiple objects
- **Encapsulation** — Data members bundled with their methods
- **Constructors** — Initializing objects with values
- **Methods** — `calculateAmount()`, `displayItemDetails()`, `displayCustomerDetails()`
