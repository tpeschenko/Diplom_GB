Чтобы запустить проект локально
Запустить PostgreSQL сервер.
Создать базу данных с именем 'eshop'
Или запустить Docker Desktop и в командной строке ввести команду: docker run --name eshop -e POSTGRES_DB=eshop -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
