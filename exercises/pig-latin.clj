(defn vowel? [letter]
  (.contains [\a \e \i \o \u] letter))

(defn pig-latin [word]
  (let [first-letter (first word)]
    (if (vowel? first-letter)
      (str word "ay")
      (str (subs word 1) first-letter "ay"))))

(println (pig-latin "red"))
(println (pig-latin "orange"))
