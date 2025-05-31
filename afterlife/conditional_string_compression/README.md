# RU
## Условия
Напишите алгоритм сжатия строкй (например, "aaabbc" → "a3b2c"), но только если это сокращает длину. Иначе вернуть исходную строку.

## Примеры
1. Ввод: "abcd" → Вывод: "abcd" (сжатие даст "a1b1c1d1" — длиннее).
2. Ввод: "aaabbbbcc" → Вывод: "a3b4c2".

## Дополнения
* Учитывать повторяющиеся символы только если их больше 2.

# ENG
## Conditions
Write a string compression algorithm (e.g. "aaabbc" → "a3b2c"), but only if it reduces the length. Otherwise, return the original string.

## Examples
1. Input: "abcd" → Output: "abcd" (compression will give "a1b1c1d1" - longer).
2. Input: "aaabbbbcc" → Output: "a3b4c2".

## Extras
* Only count repeating characters if there are more than 2.