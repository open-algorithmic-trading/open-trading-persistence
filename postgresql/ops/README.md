# Starting the DB

- Packages to install
    - make
    - docker
    - psql
- Set your password for default user (postgres) by setting env var PGPASSWORD
- Run 'make db-start'
- Run 'make db-init'

# Clean up

- 'make db-rm' to stop the container and remove it
- 'make db-nuke' to delete all postgres files