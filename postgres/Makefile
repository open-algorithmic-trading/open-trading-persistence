echo:
	@echo 'Welcome to open trading!'
	
db-start:
	mkdir -p /data
	docker build --build-arg postgres_pwd=${PGPASSWORD} -t opent-postgres:latest ./
	docker run -d -p 5432:5432 -v /data:/var/lib/postgresql/data --name opent-postgres opent-postgres:latest
	
db-init:
	psql -h 127.0.0.1 -U postgres -f ./ddl/init.sql
	psql -h 127.0.0.1 -U postgres -f ./dml/init.sql
	
db-rm:
	docker stop opent-postgres
	docker rm opent-postgres