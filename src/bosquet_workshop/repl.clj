(ns bosquet-workshop.repl)

;; Recursive
(defn fib-rec [n]
  (if (or (= n 0) (= n 1))
    n
    (+ (fib-rec (- n 1)) (fib-rec (- n 2)))))

(fib-rec 10)

;; Iterative
(defn fib-iter [n]
  (loop [a 0 b 1 i 0]
    (if (= i n)
      a
      (recur b (+ a b) (inc i)))))

(fib-iter 10)
