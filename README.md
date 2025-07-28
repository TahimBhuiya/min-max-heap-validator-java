# Heap Checker ✅

A simple Java program that determines whether a given array represents a **min heap**, **max heap**, or **neither**.

## 📌 Description

This program analyzes integer arrays to verify if they satisfy the properties of a binary heap. It includes functions to check:

* **Min Heap** – where each parent node is less than or equal to its children.
* **Max Heap** – where each parent node is greater than or equal to its children.

## 🧠 Features

* Validates min heap structure
* Validates max heap structure
* Outputs the type of heap each array represents

## 🛠️ How It Works

Each array is traversed from the root to the last parent node. The child indices (`2*i + 1` for left, `2*i + 2` for right) are used to check heap conditions.

## 🧪 Example Output

```
Array A is a min heap.