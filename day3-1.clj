(def matrix (apply map list 
       (map seq (str/split-lines (slurp "day3-1.txt")))))

(def freq (map frequencies matrix))

(defn decode [value]
  (Integer/parseInt (apply str value) 2))


(println 
(*
(decode (map (fn [value]
       (if (> (value \1) (value \0)) \1 \0)) freq))

(decode (map (fn [value]
       (if (< (value \1) (value \0)) \1 \0)) freq))))


       

