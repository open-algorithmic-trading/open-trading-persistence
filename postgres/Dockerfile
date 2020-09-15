FROM postgres:latest

ARG postgres_pwd

RUN echo "This is your password: $postgres_pwd"

ENV POSTGRES_PASSWORD=$postgres_pwd

EXPOSE 5432