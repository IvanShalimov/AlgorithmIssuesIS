# Милосердная сортировка Сталина/Merciful Stalin sort

## RUS
**Определение**
“Милосердная” (или “добрая”) сортировка Сталина — это модификация классической “Сортировки Сталина” (Stalin Sort), в которой удаляются элементы, нарушающие порядок, но с некоторым уровнем терпимости к отклонениям.

### Объяснение
Шаг 1: Выполните «милосердную» сортировку Сталина, как и раньше, разделив входной список на sortedList и eliminatedList.
Шаг 2. Объедините два списка (sortedList и eliminatedList), сохраняя при этом порядок сортировки:

Используйте два указателя (sortedIndex и eliminatedIndex) для перемещения по обоим спискам.

Сравните текущие элементы обоих списков и добавьте меньший элемент в mergedList.

Если один список исчерпан, добавьте оставшиеся элементы из другого списка.

**Вывод**: возвращается окончательный mergedList, включающий все элементы в отсортированном порядке.

## ENG
**Определение**
The “merciful” (or “kind”) Stalin sort is a modification of the classic “Stalin Sort” in which disruptive elements are removed, but with some level of tolerance for deviations.

### Explanation:
Step 1: Perform the "merciful" Stalinsort as before, splitting the input list into sortedList and eliminatedList.
Step 2: Merge the two lists (sortedList and eliminatedList) while maintaining the sorted order:

Use two pointers (sortedIndex and eliminatedIndex) to traverse both lists.

Compare the current elements of both lists and add the smaller one to the mergedList.

If one list is exhausted, add the remaining elements from the other list.

**Output**: The final merged list is returned, which includes all elements in sorted order.

## P.S.
Больше информации тут/ More info here
https://github.com/r-kataria/MercifulStalinSort
