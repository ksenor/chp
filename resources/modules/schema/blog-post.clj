(table :chp-blog-post
       (integer :id :primary-key :auto-inc)
       (integer :status (default 1))
       (integer :category-id :not-null)
       (varchar :description 150)
       (varchar :_keywords 300)
       (varchar :title 100 :not-null)
       (varchar :short_url 250)
       (text :content :not-null)
       (timestamp :expire_date)
       (timestamp :create_date (default (now)))
       (integer :user_id :not-null)
       (varchar :slug 100)
       (unique [:title]))