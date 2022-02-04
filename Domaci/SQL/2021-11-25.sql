Domaci od danas (11.25):

1.) Ispisati imena i prezimena svih aktivnih klijenata koji zive u districtu California

SELECT c.first_name AS "Name", c.last_name AS "Surname"
FROM customer c, address a
WHERE c.address_id = a.address_id AND a.district = 'California' AND active = 1;



2.) Ispisati koliko filmova pripada zanru komedija

SELECT COUNT (fc.film_id) AS "Komedijaskih filmova ima:"
FROM film f, category c, film_category fc
WHERE f.film_id = fc.film_id AND c.category_id = fc.category_id AND c.name = 'Comedy';



3.) Ispisati imena svih gradova iz Argentine i imena svih gradova iz Brazila (u jednom upitu)


SELECT ci.city AS "Gradovi u ARG i BRA:"
FROM city ci, country co
WHERE ci.country_id = co.country_id AND co.country IN ('Argentina', 'Brazil');
