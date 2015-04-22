#!/bin/bash
echo "Initializing DB 'clw'"
mysql -u root --password=password < 4-21-2014.sql 
echo "Initialization DB 'clw' compltete" 
