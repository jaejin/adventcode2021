(let [value (map #(Integer/parseInt %) (str/split-lines (slurp "day1-2.txt")))
      index (drop-last 2 value)
      ]
  (reduce (fn [[values prev result]  v]
            (let [current (reduce + (take 3 values))
                  next (rest values)]
              (list next current (if (and (> prev 0) (< prev current)) (+ 1 result) result))
              )
            ) (list value 0 0) index))
