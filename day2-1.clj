(let [data (str/split-lines (slurp "day2.txt"))
      [x y] (reduce (fn [[x y] value]
            (let [split-data (str/split value #" ")
                  keyword (first split-data)
                  value (Integer/parseInt (second split-data))
                  ]
              (cond
                (= keyword "forward") (list x (+ y value))
                (= keyword "down") (list (+ x value) y)
                (= keyword "up") (list (- x value) y)
                ))) (list 0 0) data)]
  (* x y))
