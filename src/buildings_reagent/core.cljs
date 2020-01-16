(ns buildings-reagent.core
    (:require
      [reagent.core :as r]))

(def data [{:id 0 ,:name "Burj Khalifa",:height 828},{:id 1 ,:name "Shanghai Tower",:height 632},{:id 2,
:name "Abraj Al-Bait Clock Tower",:height 601
},
{:id 3,
:name "Ping An Finance Center",:height 599
},
{:id 4,
:name "Goldin Finance 117",:height 596
},{:id 5,
:name "Lotte World Tower",:height 554
},{:id 6,
:name "One World Trade Center",:height 541
}])
;; -------------------------
;; Views

(defn home-page []
  [:div
   [:svg {:style {:width 1000,:height 500}}
     [:g {:style {:fill "black"}}
       (for [datum data] [:rect {:x (* (datum :id) 150),:y 50, :width 100, :height (/ (datum :height) 2)}])
]
]
])

;; -------------------------
;; Initialize app

(defn mount-root []
  (r/render [home-page] (.getElementById js/document "app")))

(defn init! []
  (mount-root))
