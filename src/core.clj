(ns core)

(defn dot [v1 v2]
  (reduce + (map * v1 v2)))


; v1: autodiff with native clojure datatypes 
; v2: differentiation of clojure functions 
; v3: neural networks 