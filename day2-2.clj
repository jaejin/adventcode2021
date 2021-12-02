(let [data (str/split-lines (slurp "day2.txt"))
      [x y aim] (reduce (fn [[x y aim] value]
            (let [split-data (str/split value #" ")
                  keyword (first split-data)
                  value (Integer/parseInt (second split-data))
                  ]
              (cond
                (= keyword "forward") (list x (+ y value) (+ aim (* x value)))
                (= keyword "down") (list (+ x value) y aim)
                (= keyword "up") (list (- x value) y aim)
                ))) (list 0 0 0) data)]
  (* y aim))
