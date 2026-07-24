# Java String, char[], and Character Cheat Sheet

## String Methods
> Called on a `String` object. They return either a `String`, `char`, `int`, or `boolean`.

| Method | Returns | Description |
|--------|---------|-------------|
| `s.length()` | `int` | Returns the length of the string. *(Method → uses parentheses `()`)* |
| `s.charAt(i)` | `char` | Returns the character at index `i`. |
| `s.toLowerCase()` | `String` | Returns a new string with all characters in lowercase. |
| `s.toUpperCase()` | `String` | Returns a new string with all characters in uppercase. |
| `s.equals(other)` | `boolean` | Compares the **content** of two strings. |
| `s.equalsIgnoreCase(other)` | `boolean` | Compares string content while ignoring case differences. |
| `s.toCharArray()` | `char[]` | Converts the string into a character array. Once converted, you're working with a `char[]`, **not** a `String`. |

---

## char[] (Character Array)
> These are array operations, **not String methods**.

| Syntax | Returns | Description |
|--------|---------|-------------|
| `arr.length` | `int` | Returns the size of the array. *(Property → **no** parentheses)* |
| `arr[i]` | `char` | Accesses the character at index `i`. |
| `new String(arr)` | `String` | Converts a character array back into a `String`. |

---

## Character Class
> Static helper methods for working with **individual characters**.

| Method | Returns | Description |
|--------|---------|-------------|
| `Character.toLowerCase(c)` | `char` | Converts a single character to lowercase. |
| `Character.toUpperCase(c)` | `char` | Converts a single character to uppercase. |
| `Character.isLetter(c)` | `boolean` | Returns `true` if the character is a letter. |
| `Character.isDigit(c)` | `boolean` | Returns `true` if the character is a digit. |
| `Character.isWhitespace(c)` | `boolean` | Returns `true` if the character is whitespace. |

---

## 💡 Remember

### `String`
```java
String s = "Hello";

s.length();          // ✅ Method
s.charAt(1);         // 'e'
s.toLowerCase();     // "hello"
```

### `char[]`
```java
char[] arr = s.toCharArray();

arr.length;          // ✅ Property
arr[0];              // 'H'
```

### Convert Back
```java
String str = new String(arr);
```

---

## ⚠️ Common Mistakes

❌ Incorrect
```java
arr.length();
```

✅ Correct
```java
arr.length;
```

---

❌ Incorrect
```java
s.length;
```

✅ Correct
```java
s.length();
```

---

❌ Incorrect
```java
s == other;
```

✅ Correct
```java
s.equals(other);
```

---

## Quick Summary

| Type | Length | Access Character | Convert |
|------|--------|------------------|----------|
| `String` | `s.length()` | `s.charAt(i)` | `s.toCharArray()` |
| `char[]` | `arr.length` | `arr[i]` | `new String(arr)` |
| `Character` | — | Helper methods like `Character.isLetter(c)` | — |
