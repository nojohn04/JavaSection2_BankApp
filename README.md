# 🧾 BankApp (Java)

**CSC160 – Programming Fundamentals II**

BankApp is a console-based Java program designed to calculate totals of a bank account, be able to make deposits and make withdrawals.

---

## 📋 Project Purpose

This project builds on a starter Java application and focuses on practicing core programming concepts. The objectives of this assignment include:

- Implementing a discount calculation feature  
- Displaying discount details only when they apply  
- Improving output formatting for a professional look  
- Following Java SE 17 standards and documentation practices  

---

## ⚙️ Program Flow

1. The user is prompted to enter multiple invoice items.
2. For each item, the program collects:
   - Item description  
   - Quantity purchased  
   - Unit price  
   - Discount eligibility  
3. Discounts are applied only when eligibility requirements are met.
4. After all items are entered, the program prints a receipt displaying:
   - Subtotal  
   - Discount percentage (if applied)  
   - Total savings (if applied)  
   - Final total  
5. Output is aligned and formatted using `printf` for readability.

📌 Discount-related information is only shown if at least one item qualifies.

---
## 📸 Sample Output

### ✅Receipt example with line items that qualify for a discount
~~~
==================================================
Welcome to the Invoice Total Calculator
==================================================

Item Description: Bananas
Item Quantity...: 5
Item Price......: 2

--------------------------------------------------
Do you want to enter another line item (y/n): y
--------------------------------------------------

Item Description: Chicken
Item Quantity...: 3
Item Price......: 12.50

--------------------------------------------------
Do you want to enter another line item (y/n): n
--------------------------------------------------

==================================================
Customer Receipt
==================================================
Bananas                 5  @  $  2.00 = $   10.00
            Discount   5%    -$  0.50 = $    9.50

Chicken                 3  @  $ 12.50 = $   37.50
            Discount  15%    -$  5.63 = $   31.88
--------------------------------------------------
Total Savings: $    6.13
Receipt Total: $   41.38
--------------------------------------------------
Thank you for shopping with us!
~~~
### ❌Reciept example with NO line items that qualify for a discount
~~~
==================================================
Customer Receipt
==================================================
apples                 10  @  $  0.75 = $    7.50

oranges                 6  @  $  1.00 = $    6.00
--------------------------------------------------
Receipt Total: $   13.50
--------------------------------------------------
Thank you for shopping with us!
~~~
---

## 💻 Tools & Technologies

- Java SE 17
- Console-based input/output  
- `printf` for formatted output  

---

## 👥 Authors
- [@nojohn04](https://github.com/nojohn04) Nolan Johnson
- [JesseMcLaughlin](https://github.com/JesseMcLaughlin) Jesse McLaughlin

