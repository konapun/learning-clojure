(count [19 "yellow" true])

(reverse [2 4 7])

(map #(+ % 3) [2 4 7]) ; -> (5 7 10)
(map + [2 4 7] [5 6] [1 2 3 4])

(apply + [2 4 7])

(def stooges ["Moe" "Larry" "Curly" "Shemp"])
(first stooges)
(second stooges)
(last stooges)
(nth stooges 2)
(next stooges)
(butlast stooges)
(drop-last 2 stooges)
(filter #(> (count %) 3) stooges)
(nthnext stooges 2)
(every? #(instance? String %) stooges)
(not-every? #(instance? String %) stooges)
(some #(instance? Number %) stooges)
(not-any? #(instance? Number %) stooges)
