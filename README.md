# PRICE_CHECKING_MACHINE

A simple Java console application that checks the price of products using a dictionary (`HashMap`). The program continuously asks the user for a product name and displays its price if available.

---

## 📌 Features

* Uses `HashMap<String, Integer>` to store product names and prices
* Continuously accepts user input using a `while` loop
* Allows exiting the program using `quit` or `stop`
* Displays the product price if the product exists
* Shows an error message if the product is not available

---

## 🧠 How It Works

1. A `HashMap` stores product names as keys and prices as values.
2. The program repeatedly asks the user to enter a product name.
3. If the user types `quit` or `stop`, the program exits.
4. If the product exists in the dictionary, its price is displayed.
5. If the product does not exist, a "Product is not available" message is shown.

---

## ▶️ How to Run

1. Make sure Java is installed on your system.
2. Save the file as `PRICE_CHECKING_MACHINE.java`.
3. Compile the program:

   ```
   javac PRICE_CHECKING_MACHINE.java
   ```
4. Run the program:

   ```
   java PRICE_CHECKING_MACHINE
   ```

---

## 💡 Example Output

```
Enter product name (or 'quit' to stop): PRODUCT_1
Product: PRODUCT_1
Product Price: 1

Enter product name (or 'quit' to stop): PRODUCT_9
Product is not available

Enter product name (or 'quit' to stop): quit
```

---

## ⚠️ Notes

* Product names are **case-sensitive** (e.g., `PRODUCT_1` is valid, `product_1` is not).
* The `Scanner` is created inside the loop in this version; for better practice, it can be created once outside the loop.

---

## 🛠️ Technologies Used

* Java
* `java.util.HashMap`
* `java.util.Scanner`

---

## 👩‍💻 Author

Fatima Aziz

---

Happy Coding 🚀
