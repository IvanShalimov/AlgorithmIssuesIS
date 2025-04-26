# RU
"Шифр Виженера для котов"
Задача: зашифровать строку с помощью "мяу-ключа". Каждая буква заменяется на другую по правилу:

Ключ — слово "meow", которое повторяется. В целом, можно использовать любой другой ключ

Для каждой буквы исходного текста и ключа:

Сдвиг = (номер буквы в алфавите для meow + позиция буквы в слове) % 26.

Пример:
Ввод: "cat", ключ "meow" → Вывод: "omg"

Разбор:
* c (3) + m (13) = 16 → p, но meow для 1-й буквы даёт +1 → o (15),
* a (1) + e (5) = 6 → f, но +2 → m (13),
* t (20) + o (15) = 35 → 9 → i, но +3 → g (7).

Усложнение:

Реализовать дешифровку(скоро будет).

**Усложнение:**
- Учитывайте регистр (Hello → Idkkn).
- Обрабатывайте пробелы и знаки препинания.

# ENG

"Vigenere Cipher for Cats"
Problem: Encrypt a string using a "meow key". Each letter is replaced by another according to the rule:

The key is the word "meow", which is repeated. In general, any other key can be used

For each letter of the original text and the key:

Shift = (letter number in the alphabet for meow + letter position in the word) % 26.

Example:
Input: "cat", key "meow" → Output: "omg"

Parse:
* c (3) + m (13) = 16 → p, but meow for the 1st letter gives +1 → o (15),
* a (1) + e (5) = 6 → f, but +2 → m (13),
* t (20) + o (15) = 35 → 9 → i, but +3 → g (7).

Complication:

Implement decryption (coming soon).

**Complication:**
- Be case sensitive (Hello → Idkkn).
- Handle spaces and punctuation.