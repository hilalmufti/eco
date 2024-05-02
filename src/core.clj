(ns core)

(defn dot [v1 v2]
  (reduce + (map * v1 v2)))

(defn sigmoid [z]
  (/ 1 (+ 1 (Math/exp (- z)))))


; v1: autodiff with native clojure datatypes 
; v2: differentiation of clojure functions 
; v3: neural networks 