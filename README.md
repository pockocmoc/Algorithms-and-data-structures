## Реализация HashMap
### В данном проекте реализован класс HashMap, который работает по принципу хэш-таблицы. Класс включает в себя внутренний массив узлов с индексацией по хешу и описание узла.

### Описание методов
* put(Integer key, Integer value): добавляет элемент в таблицу по заданному ключу. Если элемент с таким ключом уже существует, то его значение будет заменено на новое. Метод возвращает предыдущее значение, связанное с ключом (если было).
* get(Integer key): получает значение, соответствующее заданному ключу. Если элемента с таким ключом нет, то метод вернет null.
* remove(Integer key): удаляет элемент из таблицы по заданному ключу. Метод возвращает значение, связанное с удаленным ключом (если было).
* replace(Integer key, Integer value): заменяет значение элемента по заданному ключу на новое. Если элемента с таким ключом нет, то метод ничего не делает.
* size(): возвращает количество элементов в таблице.
* containsKey(Integer key): проверяет наличие элемента с заданным ключом.
* containsValue(Integer value): проверяет наличие элемента с заданным значением.
