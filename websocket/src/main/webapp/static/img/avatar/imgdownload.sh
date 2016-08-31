url=https://coding.net/static/fruit_avatar/Fruit-
end=.png
for i in {1..100}
do
   uri=${url}${i}${end}
   echo $uri
   wget $uri
done
