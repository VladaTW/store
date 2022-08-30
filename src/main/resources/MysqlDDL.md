
# access container
# do we need to create a volume?!?

# create a database
mysql> create database tesco;

# switch to using the DB just created
mysql> use tesco;

# create tables:
CREATE TABLE store (id INT AUTO_INCREMENT PRIMARY KEY, 
                    name VARCHAR(100) NOT NULL,
                    number_of_tills INT, 
                    type VARCHAR(20));


