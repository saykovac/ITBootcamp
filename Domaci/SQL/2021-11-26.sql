Domaci za 2. nedelju:
--1.) Ispisati u kojim sve drzavama se nalaze customer-i koji su iznamljivali komedije
-- u kojima je glumio Groucho Dunst. (Ima ih 20)
--2.) Ispisati imena i prezimena svih koji su iznajmili filmove skuplje od 11.00 bez koriscenja
-- kljucne reci WHERE (ima ih 8)
--3.) Ispisati sve filmove koje su iznajmili kupci ciji je ID dvocifren broj 
-- i sortirati ih opadajuce (ima ih 850)


U ovom zadatku --Ispisati prosecnan rejting filmova duzine izmedju 100 i 150-- 
kolona rating je tipa "mpaa_rating" pa ne mogu da uradim prosek. 
Da li je to neki previd ili postoji drugi nacin? Hvala unapred
 
Strahinja Trninic  8 hours ago
@Nataša Đuričić Veorvatno je da je profesor napravio previd, misleci da je to kao ocena filma
a ne oznaka za uzrast (ili kako god da se to strucno kaze). 
Umesto toga, mozete uzeti prosecan rental_rate ili replacement_cost



--1.) Ispisati u kojim sve drzavama se nalaze customer-i koji su iznamljivali komedije
------u kojima je glumio Groucho Dunst. (Ima ih 20)


SELECT co.country AS "Drzave :"
FROM country co, city ci, address ad, customer cu, rental r, inventory i, film f, film_category fc, category ca, film_actor fa, actor ac
WHERE co.country_id = ci.country_id
AND ci.city_id = ad.city_id
AND ad.address_id = cu.address_id
AND cu.customer_id = r.customer_id
AND r.inventory_id = i.inventory_id
AND i.film_id = f.film_id
AND f.film_id = fc.film_id
AND fc.category_id = ca.category_id
AND f.film_id = fa.film_id
AND fa.actor_id = ac.actor_id
AND ca.name = 'Comedy'
AND ac.first_name = 'Groucho'
AND ac.last_name = 'Dunst'
GROUP BY (co.country);




--2.) Ispisati imena i prezimena svih koji su iznajmili filmove skuplje od 11.00 
---- bez koriscenja kljucne reci WHERE (ima ih 8)


SELECT customer.first_name AS "Ime :", customer.last_name AS "Prezime :"
FROM ((((customer
INNER JOIN rental ON customer.customer_id = rental.customer_id)
INNER JOIN payment ON rental.rental_id = payment.rental_id)
INNER JOIN inventory ON rental.inventory_id = inventory.inventory_id)
INNER JOIN film ON inventory.film_id = film.film_id)
GROUP BY (customer.first_name, customer.last_name, payment.amount)
HAVING (payment.amount) > 11;
	   



--3.) Ispisati sve filmove koje su iznajmili kupci ciji je ID dvocifren broj 
-- i sortirati ih opadajuce (ima ih 850)


SELECT f.title AS "Nazivi filmova :"
FROM customer cu, rental re, inventory i, film f
WHERE cu.customer_id = re.customer_id
AND re.inventory_id = i.inventory_id
AND i.film_id = f.film_id
AND cu.customer_id >= 10
AND cu.customer_id <= 99
GROUP BY (f.title);

