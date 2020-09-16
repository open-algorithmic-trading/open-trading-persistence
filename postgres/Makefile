echo:
	@echo 'Welcome to open trading!'
	
db-start:
	docker build --build-arg postgres_pwd=${PGPASSWORD} -t opent-postgres:latest ./
	docker run -d -p 5432:5432 --name opent-postgres opent-postgres:latest
	
db-init:
	psql -h 127.0.0.1 -U postgres -f ./ddl/init.sql
	
db-rm:
	docker stop opent-postgres
	docker rm opent-postgres