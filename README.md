# Price Checking Machine (Java)

A simple **Console-Based Price Checking Machine** built in **Java**.
This program allows users to **enter a product name and instantly check its price** using a dictionary structure.

The system keeps running until the user types **quit** or **stop**.

---

## Features

* Check product price by entering product name
* Uses a **HashMap dictionary** to store product names and prices
* Displays price if the product exists
* Shows **"Product is not available"** if the product is not found
* Program runs continuously until the user exits

---

## Example Products

```text
PRODUCT_1 → Price: 1
PRODUCT_2 → Price: 2
PRODUCT_3 → Price: 3
PRODUCT_4 → Price: 4
PRODUCT_5 → Price: 5
PRODUCT_6 → Price: 6
```

---

## Example Output

### Product Available

```text
Enter product name (or 'quit' to stop): PRODUCT_3

Product: PRODUCT_3
Product Price: 3
```

### Product Not Available

```text
Enter product name (or 'quit' to stop): PRODUCT_10

Product is not available
```

### Exit Program

```text
Enter product name (or 'quit' to stop): quit
```

---

## Concepts Used

This project demonstrates the use of:

* **Java HashMap (Dictionary)**
* **Loops (while loop)**
* **User Input using Scanner**
* **Conditional Statements**
* **Basic Data Lookup**
