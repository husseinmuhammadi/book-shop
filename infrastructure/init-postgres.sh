#!/bin/bash
set -e

CURRENT=`date +"%Y%m%d-%H%M%S"`

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE USER "bs" WITH PASSWORD '123456';
    CREATE DATABASE bs;
    GRANT ALL PRIVILEGES ON DATABASE bs TO "bs";
EOSQL

